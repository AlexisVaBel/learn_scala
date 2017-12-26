

class SomeIFaceConnector {
  var m_iPort=0;
  var m_sHost="localhost"; 
  
  def setPort(iport:Integer)={m_iPort=iport}
    
    def setHost(shost:String)=m_sHost=shost
    
    def getPort()=m_iPort
    
    def getHost()=m_sHost  
}

object SomeIFaceConnector {
    val m_ifcon=new SomeIFaceConnector
    
    def getInstance: SomeIFaceConnector={
      m_ifcon
    }
    
    
}
