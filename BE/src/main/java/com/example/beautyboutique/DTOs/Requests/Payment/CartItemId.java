package com.example.beautyboutique.DTOs.Requests.Payment;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItemId {
    private Integer[] cartItemsId;
}
