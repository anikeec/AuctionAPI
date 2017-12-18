/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi.answer;

import com.apu.auctionapi.AuctionQuery;
import com.apu.auctionapi.QueryType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apu
 */
public class LoadLotsAnswerQuery extends AuctionQuery {
    
    List<Integer> auctionLotIdList = new ArrayList<>();
    
    public LoadLotsAnswerQuery(long packetId, int userId) {
        this(packetId, userId, "");
    }
    
    public LoadLotsAnswerQuery(long packetId, int userId, String time) {
        super(QueryType.LOAD_LOTS_ANSWER, packetId, userId, time);
    }
    
    public void addLotIdToCollection(Integer lotId) {
        if(!auctionLotIdList.contains(lotId))
                auctionLotIdList.add(lotId);
    }

    public List<Integer> getAuctionLotIdList() {
        return auctionLotIdList;
    }
    
}
