package com.ks.world.kernel;

import java.util.List;

import com.ks.rpc.ServerInfo;

public interface GameServerProcess {
	void process(List<ServerInfo> serveInfos) throws Exception;
}
