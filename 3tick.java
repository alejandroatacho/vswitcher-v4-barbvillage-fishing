if (!v.getInventory().inventoryFull() && !v.getVars().getBoolean("true")) {
    v.getInventory().useOnItem(6333,946);
    if (v.getInventory().hasIn(23129)) {
        int beginner_bottle = 23129;
        int beginner_bottle_slot = v.getInventory().slot(beginner_bottle);
        v.invoke("Open","<col=ff9040>Clue bottle (beginner)</col>",2,57,beginner_bottle_slot,9764864,false);
    } else if (v.getInventory().hasIn(13648)) {
        int easy_bottle = 13648;
        int easy_bottle_slot = v.getInventory().slot(easy_bottle);
        v.invoke("Open","<col=ff9040>Clue bottle (easy)</col>",2,57,easy_bottle_slot,9764864,false);
    } else if (v.getInventory().hasIn(13649)) {
        int medium_bottle = 13649;
        int medium_bottle_slot = v.getInventory().slot(medium_bottle);
        v.invoke("Open","<col=ff9040>Clue bottle (medium)</col>",2,57,medium_bottle_slot,9764864,false);
    } else if (v.getInventory().hasIn(13650)) {
        int hard_bottle = 13650;
        int hard_bottle_slot = v.getInventory().slot(hard_bottle);
        v.invoke("Open","<col=ff9040>Clue bottle (hard)</col>",2,57,hard_bottle_slot,9764864,false);
    } else if (v.getInventory().hasIn(13651)) {
        int elite_bottle = 13651;
        int elite_bottle_slot = v.getInventory().slot(elite_bottle);
        v.invoke("Open","<col=ff9040>Clue bottle (elite)</col>",2,57,elite_bottle_slot,9764864,false);
    }
    v.getFishing().lure(1526);
} else if (v.getInventory().inventoryFull()) {
    v.getVars().setBoolean("full", true);
    v.getWalking().walkR(wp1, 1);
}