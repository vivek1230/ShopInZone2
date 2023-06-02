package com.walmart.thor.endgame.orderingestion.dto.allocation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PickTicket {
    private List<Item> itemList;
    private String pickTicketId;
}