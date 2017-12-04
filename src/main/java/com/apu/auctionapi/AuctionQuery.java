/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author apu
 */
public abstract class AuctionQuery {
    private QueryType queryType;
    private String time;
    private long packetId;
    private int userId;

    public AuctionQuery(QueryType queryType, long packetId, int userId) {
        this.queryType = queryType;
        this.packetId = packetId;
        this.userId = userId;
        Date date = new Date();
        this.time = date.toString();
    }
    
    
    
}
