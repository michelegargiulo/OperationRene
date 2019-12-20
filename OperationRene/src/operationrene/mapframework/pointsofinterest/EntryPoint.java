package operationrene.mapframework.pointsofinterest;

import operationrene.mapframework.matrixprops.Size;

public class EntryPoint extends PointOfInterest {
    
    public EntryPoint(int roomID) {
        super(PointType.EntryPoint, roomID, new int[]{}, new Size(1, 1));
    }
    
}