public class PluginFactoryB implements PluginFactory{
        @Override
        public Plugin createPlugin(){
            return new popUpNotification();
        }
}
