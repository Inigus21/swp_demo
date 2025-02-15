package com.explorevietnam.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.explorevietnam.enums.CostRange;
import com.explorevietnam.enums.Region;
import com.explorevietnam.enums.Type;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "tours")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 150)
    private String name;

    // ManyToOne category
    private int category_id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Region region;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;

    @Enumerated(EnumType.STRING)
    @Column(name = "cost_range", nullable = false)
    private CostRange costRange;

    @Column(nullable = false)
    private float price;

    @Column(name = "suitable_for", length = 255)
    private String suitableFor;

    @Column(name = "best_time", length = 255)
    private String bestTime;

    @Column(length = 255)
    private String cuisine;

    @Column(length = 150)
    private String duration;

    @Column(name = "sight_seeing", length = 500)
    private String sightseeing;

    @Column(name = "max_capacity")
    private int maxCapacity;

    @Column(name = "available_slot")
    private int availableSlot;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TicketPrice> ticketPrices;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TourDepartureDate> tourDepartureDates;

    @ManyToOne // bi-directional
    @JoinColumn(name = "departure_location_id", nullable = false)
    private DepartureLocation departureLocation;

    @ManyToMany // Bang trung gian tour_destination
    @JoinTable(name = "tour_destination", joinColumns = @JoinColumn(name = "tour_id"), inverseJoinColumns = @JoinColumn(name = "destination_id"))
    private List<DestinationLocation> destinationLocations;

    @ManyToMany // Bang trung gian tour_transport
    @JoinTable(name = "tour_transport", joinColumns = @JoinColumn(name = "tour_id"), inverseJoinColumns = @JoinColumn(name = "transport_id"))
    private List<Transport> transports;

    @ManyToMany // Bang trung gian tour_promotion
    @JoinTable(name = "tour_promotion", joinColumns = @JoinColumn(name = "tour_id"), inverseJoinColumns = @JoinColumn(name = "promotion_id"))
    private List<Promotion> promotions;

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @Column(name = "is_delete", nullable = false)
    private boolean isDelete;
}
