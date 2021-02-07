package per.build_factory;

import per.build_factory.entity.Engine;
import per.build_factory.entity.EscapeTower;
import per.build_factory.entity.OrbitalModule;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 17:23
 * @Version 1.0
 **/
public class AirShip {
    private OrbitalModule orbitalModule; //轨道舱
    private Engine engine;
    private EscapeTower escape; //逃生舱

    public AirShip() {
    }

    public AirShip(OrbitalModule orbitalModule, Engine engine, EscapeTower escape) {
        this.orbitalModule = orbitalModule;
        this.engine = engine;
        this.escape = escape;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscape() {
        return escape;
    }

    public void setEscape(EscapeTower escape) {
        this.escape = escape;
    }
}

