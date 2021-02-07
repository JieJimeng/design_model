package per.build_factory;

import per.build_factory.entity.Engine;
import per.build_factory.entity.EscapeTower;
import per.build_factory.entity.OrbitalModule;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 18:11
 * @Version 1.0
 **/
public class FirstAirShipBuilder implements AirShipBuilder{

    @Override
    public Engine builderEngine() {
        System.out.println("");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        return null;
    }

    @Override
    public EscapeTower builderEscapeTower() {
        return null;
    }
}
