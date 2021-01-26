package te.app.evidence.customViews.circleProgress;

import android.graphics.Path;

interface Renderer {
    Path buildPath(float animationProgress, float animationSeek);
}