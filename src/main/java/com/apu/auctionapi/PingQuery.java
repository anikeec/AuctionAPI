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
public class PingQuery extends AuctionQuery {

    public PingQuery(long packetId, int userId) {
        super(QueryType.PING, packetId, userId);
    }    
    
}
