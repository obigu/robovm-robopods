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
package org.robovm.pods.facebook.messenger;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/FBSDKMessengerPlatformCapability/*</name>*/ extends Bits</*<name>*/FBSDKMessengerPlatformCapability/*</name>*/> {
    /*<values>*/
    public static final FBSDKMessengerPlatformCapability None = new FBSDKMessengerPlatformCapability(0L);
    public static final FBSDKMessengerPlatformCapability Open = new FBSDKMessengerPlatformCapability(1L);
    public static final FBSDKMessengerPlatformCapability Image = new FBSDKMessengerPlatformCapability(2L);
    public static final FBSDKMessengerPlatformCapability AnimatedGIF = new FBSDKMessengerPlatformCapability(4L);
    public static final FBSDKMessengerPlatformCapability AnimatedWebP = new FBSDKMessengerPlatformCapability(8L);
    public static final FBSDKMessengerPlatformCapability Video = new FBSDKMessengerPlatformCapability(16L);
    public static final FBSDKMessengerPlatformCapability Audio = new FBSDKMessengerPlatformCapability(32L);
    public static final FBSDKMessengerPlatformCapability RenderAsSticker = new FBSDKMessengerPlatformCapability(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/FBSDKMessengerPlatformCapability/*</name>*/[] values = _values(/*<name>*/FBSDKMessengerPlatformCapability/*</name>*/.class);

    public /*<name>*/FBSDKMessengerPlatformCapability/*</name>*/(long value) { super(value); }
    private /*<name>*/FBSDKMessengerPlatformCapability/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/FBSDKMessengerPlatformCapability/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/FBSDKMessengerPlatformCapability/*</name>*/(value, mask);
    }
    protected /*<name>*/FBSDKMessengerPlatformCapability/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/FBSDKMessengerPlatformCapability/*</name>*/[] values() {
        return values.clone();
    }
}
