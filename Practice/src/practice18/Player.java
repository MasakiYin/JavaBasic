package practice18;

public class Player  {
	
	private String position;
	private String name;
	private String country;
	private String team;
	
		public String getPosition() {
			return this.position;
		}
		public String getName() {
			return this.name;
		}
		public String getCountry() {
			return this.country;
		}
		public String getTeam() {
			return this.team;
		}
		
			public void setPosition(String position) {
				this.position = position;
			}
			public void setName(String name) {
				this.name = name;
			}
			public void setCountry(String country) {
				this.country = country;
			}
			public void setTeam(String team) {
				this.team = team;
			}
		
	public String toString() {
		return position+","+name+","+country+","+team;
	}



}

