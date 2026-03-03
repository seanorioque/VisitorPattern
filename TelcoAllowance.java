public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        String offer;
        switch (telcoName) {
            case "Smart":
                offer = "15 GB for ₱" + (int) money + "/month (no free calls/texts)";
                break;
            case "Globe":
                offer = "10 GB for ₱" + (int) money + "/month";
                break;
            case "Ditto":
                offer = "8 GB for ₱" + (int) money + "/month";
                break;
            default:
                offer = money + "/month";
        }
        return telcoName + " offers " + offer;
    }
}