/**
 * 
 */
package com.bigflag.toolkit.tool.socket.interfaces;


/***
 * 
 * Copyright 2017-2027 the original author or authors.
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
 *
 * @author Eric,Liu<br> 
 *		   mail:     34223022@qq.com<br>
 *         Create at:2017年9月26日 下午1:13:43
 */
public interface ISocketUDPService {
	public boolean startToListenUDP(
			int port
			,ISocketUDPService.OnReceiveData onReceiveData
			,ISocketUDPService.OnSessionCreated onSessionCreated
			,ISocketUDPService.OnSessionClosed onSessionClosed);
	public boolean stopListenUDP();
	
	
	public interface OnReceiveData{
		public void onReceiveData(ISocketSession socketSession,Object data);
	}
	
	public interface OnSessionCreated{
		public void onSessionCreated(ISocketSession socketSession);
	}
	
	public interface OnSessionClosed{
		public void onSessionClosed(ISocketSession socketSession);
	}
}