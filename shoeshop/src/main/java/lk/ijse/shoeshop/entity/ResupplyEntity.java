package lk.ijse.shoeshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resupply")
public class ResupplyEntity {
    @Id
    private String supplyId;
    private Date suppliedDate;
    private Double totalAmount;
    private Integer totalQty;

    @ManyToOne
    private SupplierEntity supplier;
    @OneToMany(mappedBy = "resupplyItemId.resupply", cascade = CascadeType.ALL)
    private List<ResupplyItemEntity> resupplyItems;
}
