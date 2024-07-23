int trout = 335;
int salmon = 331;
NPC fishingSpot = v.getNpc().findNearest(1526);

// Main fishing logic
void fish() {
    handleRunning();
   if (v.getLocalPlayer().hasAnimation(-1) && !v.getInventory().inventoryFull() && v.getWalking().isIdle()) {
        // If so, bait the fishing spot
        v.getFishing().lure(fishingSpot);
    } else {
        // Otherwise, manage inventory
        manageInventory();
    }
}

void handleRunning() {
    if (client.getEnergy() >= 2000) {
        v.getWalking().turnRunningOn();
    }
}

void manageInventory() {
    if (v.getInventory().inventoryFull()) {
        v.getInventory().drop(trout, salmon);
    }
}

fish();
