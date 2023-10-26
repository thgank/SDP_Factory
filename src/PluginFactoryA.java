public class PluginFactoryA implements PluginFactory{
    @Override
    public Plugin createPlugin(){
        return new SmoothAnimation();
    }
}
