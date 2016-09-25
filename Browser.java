/*
 This file is part of Geomancy software named: ضرب التخت لمعرفة ضروب البخت.

    ضرب التخت لمعرفة ضروب البخت is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    ضرب التخت لمعرفة ضروب البخت is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ضرب التخت لمعرفة ضروب البخت.  If not, see <http://www.gnu.org/licenses/>.
	
 */
package RamlComApp;
import javafx.scene.image.Image ;
/**
 *
 * @author Adham
 */
public class Browser {
    
    private final String name ;
    private final Image icon ;
    //public Browser(Image icon,String name ) {
    public Browser(String name, Image icon) {
      this.name = name ;
      this.icon = icon ;
    }
    public Image getIcon() {
      return icon ;
    }
    public String getName() {
      return name ;
    }
    @Override
    public String toString() {
      return name ;
    }
    
}