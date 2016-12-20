package softuniBlog.bindingModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavilion on 30-Nov-16.
 */
public class UserEditBindingModel extends UserBindingModel{
    private List<Integer> roles;
    public UserEditBindingModel() {this.roles = new ArrayList<>();}
    public List<Integer> getRoles() {return roles;}
    public void setRoles(List<Integer> roles) {this.roles = roles;}
}
