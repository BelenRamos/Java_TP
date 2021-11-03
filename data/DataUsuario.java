//package data;
//
//import entities.*;
//import java.sql.*;
//import java.util.LinkedList;
//
//public class DataUsuario {
//		
//		public LinkedList<Usuario> getAll(){
//			//DataRol dr=new DataRol();
//			Statement stmt=null;
//			ResultSet rs=null;
//			LinkedList<Usuario> usus= new LinkedList<>();
//			
//			try {
//				stmt= DbConector.getInstancia().getConn().createStatement();
//				rs= stmt.executeQuery("select id,nombre,apellido,tipo_doc,nro_doc,email,tel,habilitado from Usuario");
//				//intencionalmente no se recuusua la password
//				if(rs!=null) {
//					while(rs.next()) {
//						Usuario u=new Usuario();
//						u.setDocumento(new Documento());
//						u.setId(rs.getInt("id"));
//						u.setNombre(rs.getString("nombre"));
//						u.setApellido(rs.getString("apellido"));
//						u.getDocumento().setTipo(rs.getString("tipo_doc"));
//						u.getDocumento().setNro(rs.getString("nro_doc"));
//						u.setEmail(rs.getString("email"));
//						u.setTel(rs.getString("tel"));
//						
//						//u.setHabilitado(rs.getBoolean("habilitado"));
//						
//						//dr.setRoles(u);
//						
//						usus.add(u);
//					}
//				}
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//				
//			} finally {
//				try {
//					if(rs!=null) {rs.close();}
//					if(stmt!=null) {stmt.close();}
//					DbConector.getInstancia().releaseConn();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			
//			return usus;
//		}
//		
//		public Usuario getByUser(Usuario usu) {
//			//DataRol dr=new DataRol();
//			Usuario p=null;
//			PreparedStatement stmt=null;
//			ResultSet rs=null;
//			try {
//				stmt=DbConector.getInstancia().getConn().prepareStatement(
//						"select id,nombre,apellido,tipo_doc,nro_doc,email,tel,habilitado from Usuario where email=? and password=?"
//						);
//				//stmt.setString(1, usu.getEmail());
//				stmt.setString(2, usu.getPassword());
//				rs=stmt.executeQuery();
//				if(rs!=null && rs.next()) {
//					Usuario u=new Usuario();
//					u.setDocumento(new Documento());
//					u.setId(rs.getInt("id"));
//					u.setNombre(rs.getString("nombre"));
//					u.setApellido(rs.getString("apellido"));
//					u.getDocumento().setTipo(rs.getString("tipo_doc"));
//					u.getDocumento().setNro(rs.getString("nro_doc"));
//					u.setEmail(rs.getString("email"));
//					u.setTel(rs.getString("tel"));
//					//u.setHabilitado(rs.getBoolean("habilitado"));
//					//
//					//dr.setRoles(u);
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}finally {
//				try {
//					if(rs!=null) {rs.close();}
//					if(stmt!=null) {stmt.close();}
//					DbConector.getInstancia().releaseConn();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			return u;
//		}
//		
//		public Usuario getByDocumento(Usuario usu) {
//			//DataRol dr=new DataRol();
//			Usuario p=null;
//			PreparedStatement stmt=null;
//			ResultSet rs=null;
//			try {
//				stmt=DbConector.getInstancia().getConn().prepareStatement(
//						"select id,nombre,apellido,tipo_doc,nro_doc,email,tel,habilitado from Usuario where tipo_doc=? and nro_doc=?"
//						);
//				stmt.setString(1, usu.getDocumento().getTipo());
//				stmt.setString(2, usu.getDocumento().getNro());
//				rs=stmt.executeQuery();
//				if(rs!=null && rs.next()) {
//					Usuario u=new Usuario();
//					u.setDocumento(new Documento());
//					u.setId(rs.getInt("id"));
//					u.setNombre(rs.getString("nombre"));
//					u.setApellido(rs.getString("apellido"));
//					u.getDocumento().setTipo(rs.getString("tipo_doc"));
//					u.getDocumento().setNro(rs.getString("nro_doc"));
//					u.setEmail(rs.getString("email"));
//					u.setTel(rs.getString("tel"));
//					u.setHabilitado(rs.getBoolean("habilitado"));
//					//
//					dr.setRoles(u);
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}finally {
//				try {
//					if(rs!=null) {rs.close();}
//					if(stmt!=null) {stmt.close();}
//					DbConector.getInstancia().releaseConn();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			return u;
//		}
//		
//		public void add(Usuario u) {
//			PreparedStatement stmt= null;
//			ResultSet keyResultSet=null;
//			try {
//				stmt=DbConector.getInstancia().getConn().
//						prepareStatement(
//								"insert into Usuario(nombre, apellido, tipo_doc, nro_doc, email, password, tel, habilitado) values(?,?,?,?,?,?,?,?)",
//								PreparedStatement.RETURN_GENERATED_KEYS
//								);
//				stmt.setString(1, u.getNombre());
//				stmt.setString(2, u.getApellido());
//				stmt.setString(3, u.getDocumento().getTipo());
//				stmt.setString(4, u.getDocumento().getNro());
//				stmt.setString(5, u.getEmail());
//				stmt.setString(5, u.getPassword());
//				stmt.setString(6, u.getTel());
//				stmt.setBoolean(7, u.isHabilitado());
//				stmt.executeUpdate();
//				
//				keyResultSet=stmt.getGeneratedKeys();
//	            if(keyResultSet!=null && keyResultSet.next()){
//	                u.setId(keyResultSet.getInt(1));
//	            }
//	            
//	            //DataRol dr = new DataRol();
//	            //dr.setRolesDeUsuario(u);
//
//				
//			}  catch (SQLException e) {
//	            e.printStackTrace();
//			} finally {
//	            try {
//	                if(keyResultSet!=null)keyResultSet.close();
//	                if(stmt!=null)stmt.close();
//	                DbConector.getInstancia().releaseConn();
//	            } catch (SQLException e) {
//	            	e.printStackTrace();
//	            }
//			}
//	    }
//
//		
//	}
//
//
//
