sample
===
* 注释

	select #use("cols")# from user  where  #use("condition")#

cols
===
	id,user_name,pwd,role_id,create_date,modify_date

updateSample
===
	
	id=#id#,user_name=#userName#,pwd=#pwd#,role_id=#roleId#,create_date=#createDate#,modify_date=#modifyDate#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(userName)){
	 and user_name=#userName#
	@}
	@if(!isEmpty(pwd)){
	 and pwd=#pwd#
	@}
	@if(!isEmpty(roleId)){
	 and role_id=#roleId#
	@}
	@if(!isEmpty(createDate)){
	 and create_date=#createDate#
	@}
	@if(!isEmpty(modifyDate)){
	 and modify_date=#modifyDate#
	@}
	
	