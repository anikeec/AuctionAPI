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
public class AnswerQuery extends AuctionQuery {
    
    private String message;
    
    public AnswerQuery(long packetId, int userId, String time, String message) {
        super(QueryType.ANSWER, packetId, userId, time);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
