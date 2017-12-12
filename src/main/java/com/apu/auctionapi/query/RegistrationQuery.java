/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi.query;

import com.apu.auctionapi.AuctionQuery;
import com.apu.auctionapi.QueryType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apu
 */
public class RegistrationQuery extends AuctionQuery {
    
    private final List<Integer> observableLotIdList = new ArrayList<>();
    
    public RegistrationQuery(int userId) {
        this(0, userId, "");
    }
    
    public RegistrationQuery(long packetId, int userId) {
        this(packetId, userId, "");
    }

    public RegistrationQuery(long packetId, int userId, String time) {
        super(QueryType.REGISTRATION, packetId, userId, time);
    }   

    public List<Integer> getObservableLotIdList() {
        return observableLotIdList;
    }  
    
    public void addLotIdToObservableList(int lotId) {
        if(!observableLotIdList.contains(lotId))
            observableLotIdList.add(lotId);
    }
    
    public void addLotIdListToObservableList(List<Integer> lotIdList) {
        observableLotIdList.addAll(lotIdList);
    }
    
}
