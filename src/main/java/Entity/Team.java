package Entity;

import Base.Entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Team extends BaseEntity {
    public static final String NAME = "name";
    public static final String CITY = "city";

    @Column(nullable = false)
    String name;

    @ManyToOne
    @Column(nullable = false)
    City city;

}
