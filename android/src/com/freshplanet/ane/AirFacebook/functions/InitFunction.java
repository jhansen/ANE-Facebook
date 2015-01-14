//////////////////////////////////////////////////////////////////////////////////////
//
//  Copyright 2012 Freshplanet (http://freshplanet.com | opensource@freshplanet.com)
//  
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//  
//    http://www.apache.org/licenses/LICENSE-2.0
//  
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//  
//////////////////////////////////////////////////////////////////////////////////////

package com.freshplanet.ane.AirFacebook.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREObject;
import com.freshplanet.ane.AirFacebook.AirFacebookExtension;

public class InitFunction extends BaseFunction
{
	public FREObject call(FREContext context, FREObject[] args)
	{
		super.call(context, args);

        String appID = getStringFromFREObject(args[0]);
        Boolean legacyMode = getBooleanFromFREObject(args[2]);
		
		AirFacebookExtension.log("Initializing with application ID " + appID);
		
		AirFacebookExtension.context.init(appID, legacyMode);
		
		return null;
	}
}