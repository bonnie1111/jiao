package com.briup.crm.bean;

public class SysRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_id
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_name
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_desc
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    private String roleDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_flag
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    private Integer roleFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_id
     *
     * @return the value of sys_role.role_id
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_id
     *
     * @param roleId the value for sys_role.role_id
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_name
     *
     * @return the value of sys_role.role_name
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_name
     *
     * @param roleName the value for sys_role.role_name
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_desc
     *
     * @return the value of sys_role.role_desc
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_desc
     *
     * @param roleDesc the value for sys_role.role_desc
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_flag
     *
     * @return the value of sys_role.role_flag
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public Integer getRoleFlag() {
        return roleFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_flag
     *
     * @param roleFlag the value for sys_role.role_flag
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public void setRoleFlag(Integer roleFlag) {
        this.roleFlag = roleFlag;
    }
}