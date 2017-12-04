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
public class NewRateQuery extends AuctionQuery {
    private int lotId;
    private int price;

    public NewRateQuery(int lotId, int price, long packetId, int userId) {
        super(QueryType.NEW_RATE, packetId, userId);
        this.lotId = lotId;
        this.price = price;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
