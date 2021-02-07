package per.build_factory;

import per.build_factory.entity.Engine;
import per.build_factory.entity.EscapeTower;
import per.build_factory.entity.OrbitalModule;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 17:54
 * @Version 1.0
 **/
public interface AirShipBuilder {
    public Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
