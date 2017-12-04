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
public class RegistrationQuery extends AuctionQuery {

    public RegistrationQuery(long packetId, int userId) {
        super(QueryType.REGISTRATION, packetId, userId);
    }   
    
}
