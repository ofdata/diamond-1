import com.taobao.diamond.manager.ManagerListener;
import com.taobao.diamond.manager.impl.DefaultDiamondManager;

import java.util.concurrent.Executor;

/**
 * Created by ipaomian on 15/1/13.
 */
public class test {
    static public void main(String[] args) {
        final DefaultDiamondManager manager = new DefaultDiamondManager("DEFAULT_GROUP", "test",new ManagerListener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            @Override
            public void receiveConfigInfo(String configInfo) {
                System.out.println("shabi"+configInfo);

            }
        });

        String info = manager.getAvailableConfigureInfomation(1000);
        System.out.println(info);
    }
}
