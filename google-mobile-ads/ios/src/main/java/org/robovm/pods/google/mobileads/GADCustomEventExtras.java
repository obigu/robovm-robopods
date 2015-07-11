/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.google.mobileads;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADCustomEventExtras/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADAdNetworkExtras/*</implements>*/ {

    /*<ptr>*/public static class GADCustomEventExtrasPtr extends Ptr<GADCustomEventExtras, GADCustomEventExtrasPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADCustomEventExtras.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADCustomEventExtras() {}
    protected GADCustomEventExtras(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public void setExtras(String label, NSDictionary<?, ?> extras) {
        setExtras0(extras, label);
    }
    /*<methods>*/
    @Method(selector = "setExtras:forLabel:")
    private native void setExtras0(NSDictionary<?, ?> extras, String label);
    @Method(selector = "extrasForLabel:")
    public native NSDictionary<?, ?> getExtras(String label);
    @Method(selector = "removeAllExtras")
    public native void removeAllExtras();
    @Method(selector = "allExtras")
    public native NSDictionary<?, ?> getAllExtras();
    /*</methods>*/
}