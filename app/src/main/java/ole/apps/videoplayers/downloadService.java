package ole.apps.videoplayers;

import android.app.Notification;

import androidx.annotation.Nullable;

import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Scheduler;

import java.util.List;

public class downloadService extends DownloadService {

    protected downloadService(int foregroundNotificationId) {
        super(foregroundNotificationId);
    }

    @Override
    protected DownloadManager getDownloadManager() {

        return new DownloadManager;
    }

    @Nullable
    @Override
    protected Scheduler getScheduler() {
        return null;
    }

    @Override
    protected Notification getForegroundNotification(List<Download> downloads) {
        return null;
    }
}
