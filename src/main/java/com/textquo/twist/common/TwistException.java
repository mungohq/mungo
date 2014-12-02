/**
 *
 * Copyright (c) 2014 Kerby Martino and others. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.textquo.twist.common;

@SuppressWarnings("serial")
public class TwistException extends RuntimeException {

    public TwistException() {
		super();
	}

    public TwistException(String message){
		super(message);
	}
	
	public TwistException(String message, Throwable cause){
		super(message, cause);
	}	

	public TwistException(int code, String message){
		super("Exception " + code + " " + message);
	}

    public TwistException(Throwable cause) {
        super(cause);
    }

}
