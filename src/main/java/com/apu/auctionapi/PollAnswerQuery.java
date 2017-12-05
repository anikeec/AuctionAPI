/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apu
 */
public class PollAnswerQuery extends AuctionQuery {
    
    List<AuctionLotEntity> auctionLots = new ArrayList<>();
    
    public PollAnswerQuery(long packetId, int userId, String time) {
        super(QueryType.POLL_ANSWER, packetId, userId, time);
    }
    
    public void addLotToCollection(AuctionLotEntity lot) {
        if(!auctionLots.contains(lot))
                auctionLots.add(lot);
    }
    
}
