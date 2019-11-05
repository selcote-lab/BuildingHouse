abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }
    //default implementation, hook method
    private void buildWindows(){
        System.out.println("Building Glass Windows");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    public void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }
}

class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}

class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
