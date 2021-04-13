package ro.ase.csie.cts.g1092.dp.decorator;

public class ShieldDecorator extends AbstractDecorator{

    int shieldPower;

    public ShieldDecorator(SuperHeroCharacter decoratedObject,
                           int shieldPower) {
        super(decoratedObject);
        this.shieldPower = shieldPower;
    }

    @Override
    public void takeHit(int points) {
        int realPoints = points - shieldPower;
        if(realPoints < 0){
            realPoints = 0;
        }
        else{
            this.decoratedObject.takeHit(points);
        }
    }
}
