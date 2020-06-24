/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.users;

/**
 *
 * @author USER
 */
public class UsersDTO {
    private String id;
    private String password;
    private String username;
    private String email;
    private String phone;
    private String photo;
    private String roleId;
    private boolean status;

    public UsersDTO(String id, String password, String username, String email, String phone, String photo, String roleId, boolean status) {
        setId(id);
        setPassword(password);
        setUsername(username);
        setEmail(email);
        setPhone(phone);
        setPhoto(photo);
        setRoleId(roleId);
        setStatus(status);
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UsersDTO{" + "id=" + id + ", password=" + password + ", username=" + username + ", email=" + email + ", phone=" + phone + ", photo=" + photo + ", roleId=" + roleId + ", status=" + status + '}';
    }
    
    
    
    
    
}
