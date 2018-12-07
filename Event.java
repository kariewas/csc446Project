
// event representation
class Event implements Comparable {

 public Event(int a_type, double a_time, int a_seqNum) { _type = a_type; time = a_time; seqNum = a_seqNum; }
  
 public double time;
 private int _type;
 public int seqNum;
 
 public int get_type() { return _type; }
 public double get_time() { return time; }
 public int get_seqNum() { return seqNum; }

 public Event leftlink, rightlink, uplink;

 public int compareTo(Object _cmpEvent ) {
  double _cmp_time = ((Event) _cmpEvent).get_time() ;
  if( this.time < _cmp_time) return -1;
  if( this.time == _cmp_time) return 0;
  return 1;
 }
};
