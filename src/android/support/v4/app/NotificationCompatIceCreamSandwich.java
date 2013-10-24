package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;

class NotificationCompatIceCreamSandwich
{
  static Notification add(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Notification.Builder localBuilder1 = new Notification.Builder(paramContext);
    long l = paramNotification.when;
    Notification.Builder localBuilder2 = localBuilder1.setWhen(l);
    int i = paramNotification.icon;
    int j = paramNotification.iconLevel;
    Notification.Builder localBuilder3 = localBuilder2.setSmallIcon(i, j);
    RemoteViews localRemoteViews = paramNotification.contentView;
    Notification.Builder localBuilder4 = localBuilder3.setContent(localRemoteViews);
    CharSequence localCharSequence = paramNotification.tickerText;
    Notification.Builder localBuilder5 = localBuilder4.setTicker(localCharSequence, paramRemoteViews);
    Uri localUri = paramNotification.sound;
    int k = paramNotification.audioStreamType;
    Notification.Builder localBuilder6 = localBuilder5.setSound(localUri, k);
    long[] arrayOfLong = paramNotification.vibrate;
    Notification.Builder localBuilder7 = localBuilder6.setVibrate(arrayOfLong);
    int m = paramNotification.ledARGB;
    int n = paramNotification.ledOnMS;
    int i1 = paramNotification.ledOffMS;
    Notification.Builder localBuilder8 = localBuilder7.setLights(m, n, i1);
    boolean bool1;
    boolean bool2;
    label183: boolean bool3;
    label205: Notification.Builder localBuilder13;
    if ((paramNotification.flags & 0x2) != 0)
    {
      bool1 = true;
      Notification.Builder localBuilder9 = localBuilder8.setOngoing(bool1);
      if ((paramNotification.flags & 0x8) == 0)
        break label342;
      bool2 = true;
      Notification.Builder localBuilder10 = localBuilder9.setOnlyAlertOnce(bool2);
      if ((paramNotification.flags & 0x10) == 0)
        break label348;
      bool3 = true;
      Notification.Builder localBuilder11 = localBuilder10.setAutoCancel(bool3);
      int i2 = paramNotification.defaults;
      Notification.Builder localBuilder12 = localBuilder11.setDefaults(i2).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1);
      PendingIntent localPendingIntent1 = paramNotification.deleteIntent;
      localBuilder13 = localBuilder12.setDeleteIntent(localPendingIntent1);
      if ((paramNotification.flags & 0x80) == 0)
        break label354;
    }
    label342: label348: label354: for (boolean bool4 = true; ; bool4 = false)
    {
      PendingIntent localPendingIntent2 = paramPendingIntent2;
      Notification.Builder localBuilder14 = localBuilder13.setFullScreenIntent(localPendingIntent2, bool4);
      Bitmap localBitmap = paramBitmap;
      Notification.Builder localBuilder15 = localBuilder14.setLargeIcon(localBitmap).setNumber(paramInt1);
      int i3 = paramInt2;
      int i4 = paramInt3;
      boolean bool5 = paramBoolean;
      return localBuilder15.setProgress(i3, i4, bool5).getNotification();
      bool1 = false;
      break;
      bool2 = false;
      break label183;
      bool3 = false;
      break label205;
    }
  }
}

/* Location:           /home/vovs/Downloads/apk_decompile/tmp/code_dec/com.google.android.music-2/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.NotificationCompatIceCreamSandwich
 * JD-Core Version:    0.6.2
 */