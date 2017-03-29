package android.content.pm;

import android.content.IntentFilter;

import java.util.ArrayList;

/**
 * Created by smallville on 2017/3/28.
 */

public class PackageParser {
    public final static class Package {
        public String packageName;
    }

    public final static class Activity extends Component<ActivityIntentInfo> {

    }

    public final static class ActivityIntentInfo extends IntentInfo {

    }

    public static class Component<II extends IntentInfo> {
        public final ArrayList<II> intents = null;
    }

    public static class IntentInfo extends IntentFilter {

    }
}
