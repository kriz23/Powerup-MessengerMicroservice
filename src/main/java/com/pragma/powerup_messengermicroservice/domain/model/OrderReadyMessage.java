package com.pragma.powerup_messengermicroservice.domain.model;

public class OrderReadyMessage {
    private String clientPhone;
    private String restaurantPhone;
    private String restaurantName;
    private String orderPIN;
    
    public OrderReadyMessage() {
    }
    
    public OrderReadyMessage(String clientPhone, String restaurantPhone, String restaurantName, String orderPIN) {
        this.clientPhone = clientPhone;
        this.restaurantPhone = restaurantPhone;
        this.restaurantName = restaurantName;
        this.orderPIN = orderPIN;
    }
    
    public String getClientPhone() {
        return clientPhone;
    }
    
    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }
    
    public String getRestaurantPhone() {
        return restaurantPhone;
    }
    
    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }
    
    public String getRestaurantName() {
        return restaurantName;
    }
    
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    public String getOrderPIN() {
        return orderPIN;
    }
    
    public void setOrderPIN(String orderPIN) {
        this.orderPIN = orderPIN;
    }
}
