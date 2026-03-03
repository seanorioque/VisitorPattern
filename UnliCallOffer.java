public class UnliCallOffer implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return telcoName + ": No unlimited calls/texts package. Charged per use.";
        }
        switch (telcoName) {
            case "Globe":
                return telcoName + ": Unlimited calls and texts within Globe network. Other networks charged extra.";
            case "Ditto":
                return telcoName + ": Unlimited calls and texts to ALL networks nationwide.";
            default:
                return telcoName + ": Unlimited calls and texts included.";
        }
    }
}