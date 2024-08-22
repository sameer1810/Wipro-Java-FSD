package com.sam.milestone1;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerService {
    private Queue<String> serviceRequests;

    public CustomerService() {
        serviceRequests = new LinkedList<>();
    }

    public void addRequest(String request) {
        serviceRequests.add(request);
        System.out.println("CUSTOMER SERVICE REQUEST ADDED.");
    }

    public String processRequest() {
        if (!serviceRequests.isEmpty()) {
            String processedRequest = serviceRequests.poll();
            System.out.println("PROCESSED REQUEST: " + processedRequest);
            return processedRequest;
        }
        System.out.println("NO PENDING REQUESTS.");
        return null;
    }

    public void viewPendingRequests() {
        if (serviceRequests.isEmpty()) {
            System.out.println("NO PENDING REQUESTS.");
        } else {
            System.out.println("PENDING REQUESTS.: " + serviceRequests);
        }
    }
}
