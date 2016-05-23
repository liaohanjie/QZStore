package com.ks.db.model;

import java.io.Serializable;
import java.util.Date;

import com.ks.access.DBBeanSet;
import com.ks.access.DBFieldSet;
import com.ks.constant.SystemConstant;

/**
 * 公会技能
 * 
 * @author ks
 */
@DBBeanSet(tablename="t_guild_skill", primaryKey={"guild_id","skill_id"})
public class GuildSkill implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 公会编号 */
	@DBFieldSet(dbfname="guild_id")
	private int guildId;
	/** 技能编号 */
	@DBFieldSet(dbfname="skill_id")
	private int skillId;
	/** gp点 */
	@DBFieldSet(dbfname="gp")
	private int gp;
	/** 创建时间 */
	@DBFieldSet(dbfname="create_time")
	private Date createTime = new Date();
	/** 修改时间 */
	@DBFieldSet(dbfname="update_time")
	private Date updateTime = new Date();
	
	public int getSkillLevel(){
		for(int[] a : SystemConstant.GUILD_SKILL_LEVEL){
			if(a[1]>gp){
				return a[0];
			}
		}
		return SystemConstant.GUILD_SKILL_LEVEL.length;
	}
	
	public int getAtk(){
		for(int[] a : SystemConstant.GUILD_SKILL_LEVEL){
			if(a[1]>gp){
				return a[2];
			}
		}
		return SystemConstant.GUILD_SKILL_LEVEL[SystemConstant.GUILD_SKILL_LEVEL.length-1][2];
	}
	
	public int getHp(){
		for(int[] a : SystemConstant.GUILD_SKILL_LEVEL){
			if(a[1]>gp){
				return a[3];
			}
		}
		return SystemConstant.GUILD_SKILL_LEVEL[SystemConstant.GUILD_SKILL_LEVEL.length-1][3];
	}
	
	public int getCrit(){
		for(int[] a : SystemConstant.GUILD_SKILL_LEVEL){
			if(a[1]>gp){
				return a[4];
			}
		}
		return SystemConstant.GUILD_SKILL_LEVEL[SystemConstant.GUILD_SKILL_LEVEL.length-1][4];
	}
	public int getGuildId() {
		return guildId;
	}

	public void setGuildId(int guildId) {
		this.guildId = guildId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public int getGp() {
		return gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
