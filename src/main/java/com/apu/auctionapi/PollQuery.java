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
public class PollQuery extends AuctionQuery {

    public PollQuery(long packetId, int userId, String time) {
        super(QueryType.POLL, packetId, userId, time);
    }    
    
}
