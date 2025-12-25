

  class  Cylinder {
      private int radius;
      private int  height;

  public Cylinder(int radius,int height){
      this.radius=radius;
      this.height=height;
  }
   public int getRadius(){
      return radius ;
   }
   public void  setRadius( int radius){
      this.radius =radius;

   }
   public int getHeight(){
      return height;
   }
   public void setHeight( int height) {
       this.height = height;

   }
    public static class Practice {
    public static void main(String []args) {
        Cylinder cg = new Cylinder(8, 12);
        System.out.println(cg.getHeight());

        System.out.println(cg.getRadius());
    }
    }
}