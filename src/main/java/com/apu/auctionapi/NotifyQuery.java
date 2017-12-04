/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi;

/**
 *
 * @author apu
 */
public class NotifyQuery extends AuctionQuery {
    private int lotId;
    private int price;
    private int lastRateUserId;

    public NotifyQuery(int lotId, int price, int lastRateUserId, 
                        long packetId, int userId) {
        super(QueryType.NOTIFY, packetId, userId);
        this.lotId = lotId;
        this.price = price;
        this.lastRateUserId = lastRateUserId;
    }
    
    
}
