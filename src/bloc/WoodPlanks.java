package bloc;

import run.MineUtils;

public class WoodPlanks extends Ressource {

    public WoodPlanks() {
        super("woodPlank", MineUtils.WOOD_PLANKS, 5, "hache");
        this.pattern.add(MineUtils.tabRessources[2]);
        this.pattern.add(null);
        this.pattern.add(null);
        this.pattern.add(null);
        this.pattern.add(null);
        this.pattern.add(null);
        this.pattern.add(null);
        this.pattern.add(null);
        this.pattern.add(null);
        this.nbGenere=4;
    }
}
