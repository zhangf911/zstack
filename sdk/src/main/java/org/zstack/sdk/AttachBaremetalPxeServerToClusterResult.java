package org.zstack.sdk;

import org.zstack.sdk.BaremetalPxeServerInventory;

public class AttachBaremetalPxeServerToClusterResult {
    public BaremetalPxeServerInventory inventory;
    public void setInventory(BaremetalPxeServerInventory inventory) {
        this.inventory = inventory;
    }
    public BaremetalPxeServerInventory getInventory() {
        return this.inventory;
    }

}
