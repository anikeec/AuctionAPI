/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi.query;

import com.apu.auctionapi.AuctionQuery;
import com.apu.auctionapi.QueryType;

/**
 *
 * @author apu
 */
public class RegistrationQuery extends AuctionQuery {
    
    public RegistrationQuery(long packetId, int userId) {
        this(packetId, userId, "");
    }

    public RegistrationQuery(long packetId, int userId, String time) {
        super(QueryType.REGISTRATION, packetId, userId, time);
    }   
    
}
